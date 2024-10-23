package camps.camps.service;

import camps.camps.model.Batch;
import camps.camps.repository.BatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BatchService {
    @Autowired
    private BatchRepository batchRepository;

    public List<Batch> getAllBatches() {
        return batchRepository.findAll();
    }

    public Optional<Batch> getBatchById(Integer id) {
        return batchRepository.findById(id);
    }

    public Batch createBatch(Batch batch) {
        return batchRepository.save(batch);
    }

    public void deleteBatch(Integer id) {
        batchRepository.deleteById(id);
    }

    public Batch updateBatch(Batch batch) {
        return batchRepository.save(batch);
    }
}
