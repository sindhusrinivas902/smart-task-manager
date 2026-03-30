package task_manager_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import task_manager_api.model.Task;
import task_manager_api.repository.TaskRepository;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository repository;

    // CREATE TASK
    @PostMapping
    public Task addTask(@RequestBody Task task) {

        task.setStatus("Pending");

        LocalDate today = LocalDate.now();

        if (task.getDeadline() == null) {
            task.setPriority("LOW");
        }
        else if (task.getDeadline().isBefore(today.plusDays(2))) {
            task.setPriority("HIGH");
        }
        else if (task.getDeadline().isBefore(today.plusDays(7))) {
            task.setPriority("MEDIUM");
        }
        else {
            task.setPriority("LOW");
        }

        return repository.save(task);
    }

    // GET ALL TASKS (sorted by deadline)
    @GetMapping
    public List<Task> getAllTasks() {
        List<Task> tasks = repository.findAll();

        tasks.sort(Comparator.comparing(
                Task::getDeadline,
                Comparator.nullsLast(Comparator.naturalOrder())
        ));

        return tasks;
    }

    // DELETE TASK
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        repository.deleteById(id);
    }
    @PutMapping("/{id}/complete")
    public Task markCompleted(@PathVariable Long id) {
        Task task = repository.findById(id).orElseThrow();
        task.setStatus("Completed");
        return repository.save(task);
    }
    }
