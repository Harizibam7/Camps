package camps.camps.controller;

import camps.camps.model.Batch;
import camps.camps.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/batches")
public class BatchController {

    @Autowired
    private BatchService batchService;

    @GetMapping
    public List<Batch> getAllBatches() {
        return batchService.getAllBatches();
    }

    @GetMapping("/{id}")
    public Optional<Batch> getBatchById(@PathVariable Integer id) {
        return batchService.getBatchById(id);
    }

    @PostMapping
    public Batch createBatch(@RequestBody Batch batch) {
        return batchService.createBatch(batch);
    }

    @PutMapping("/{id}")
    public Batch updateBatch(@PathVariable Integer id, @RequestBody Batch batch) {
        batch.setBatchId(id);
        return batchService.updateBatch(batch);
    }

    @DeleteMapping("/{id}")
    public void deleteBatch(@PathVariable Integer id) {
        batchService.deleteBatch(id);
    }
}
