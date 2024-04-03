package com.example.netuteca.controllers;

import com.example.netuteca.models.ReaderModel;
import com.example.netuteca.services.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/")
public class ReaderController {

    @Autowired
    private ReaderService readerService;

    @PostMapping("/readers")
    public ResponseEntity<ReaderModel> createReader(@RequestBody ReaderModel readerModel) {
        ReaderModel creaReaderModel = readerService.saveReader(readerModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(creaReaderModel);
    }

    @GetMapping("/readers")
    public ResponseEntity<List<ReaderModel>> getAllReaders() {
        List<ReaderModel> readers = readerService.getAllReaders();
        return ResponseEntity.ok(readers);
    }

    @GetMapping("/readers/{id}")
    public ResponseEntity<Object> getReaderById(@PathVariable Long id) {
        var reader = readerService.getReaderById(id);
        if (reader.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Reader not found!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(reader.get());

    }

    @PutMapping("readers/{id}")
    public ResponseEntity<ReaderModel> updateReader(@PathVariable Long id, @RequestBody ReaderModel readerModel) {
        return readerService.findById(id)
                .map(reader -> {
                    reader.setName(readerModel.getName());
                    reader.setContact(readerModel.getContact());
                    reader.setEmail(readerModel.getEmail());
                    reader.setCpf(readerModel.getCpf());

                    readerService.saveReader(reader);
                    return ResponseEntity.status(HttpStatus.OK).body(reader);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("readers/{id}")
    public ResponseEntity<Void> deleteReader(@PathVariable Long id) {
        readerService.remove(id);
        return ResponseEntity.ok().<Void>build(); //estou retornando o statusCode 200 para evitar informaçoes de seguranca serem vazadas.
    }

}