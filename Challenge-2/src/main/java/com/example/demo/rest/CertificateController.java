package com.example.demo.rest;

import com.example.demo.domain.Certificate;
import com.example.demo.domain.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Challenge/v1/certificates")
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    @GetMapping
    public List<Certificate> findAll(){
        return certificateService.findAll();
    }

    @PostMapping
    public Certificate create(@RequestBody Certificate certificate){
        return certificateService.create(certificate);
    }

    @PutMapping
    public Certificate update(@RequestBody Certificate certificate){
        return certificateService.update(certificate);
    }

    @DeleteMapping("/{id}")
    public void  delete(@PathVariable String id){
        certificateService.delete(id);
    }
}
