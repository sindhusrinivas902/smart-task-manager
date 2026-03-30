package task_manager_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import task_manager_api.model.Task;
import task_manager_api.repository.TaskRepository;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    // ✅ GET ALL
    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // ✅ GET BY ID
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    // ✅ CREATE (POST)
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    // ✅ UPDATE
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        Task existing = taskRepository.findById(id).orElse(null);

        if (existing != null) {
            existing.setTitle(task.getTitle());
            existing.setDescription(task.getDescription());
            existing.setStatus(task.getStatus());
            existing.setPriority(task.getPriority());
            existing.setDeadline(task.getDeadline());

            return taskRepository.save(existing);
        }

        return null;
    }

    // ✅ DELETE
    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
        return "Task deleted";
    }
}