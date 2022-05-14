package com.example.demo.application;

import com.example.demo.domain.Certificate;
import com.example.demo.domain.CertificateRepository;
import com.example.demo.domain.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificateServiceImpl implements CertificateService {

    @Autowired
    private CertificateRepository certificateRepository;

    @Override
    public List<Certificate> findAll() {
        return certificateRepository.findAll();
    }

    @Override
    public Certificate create(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    @Override
    public Certificate update(Certificate certificate) {
        Optional<Certificate> optionalCertificate = certificateRepository.findById(certificate.getId());
        if (!optionalCertificate.isPresent()) throw new RuntimeException("No se encontro el certificado");
        return certificateRepository.save(certificate);
    }

    @Override
    public void delete(String id) {
        Optional<Certificate> optionalCertificate = certificateRepository.findById(id);
        if (!optionalCertificate.isPresent()) throw new RuntimeException("No se encontro el certificado");
        certificateRepository.deleteById(id);
    }
}
