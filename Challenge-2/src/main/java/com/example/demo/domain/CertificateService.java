package com.example.demo.domain;


import java.util.List;

public interface CertificateService {

    List<Certificate> findAll();

    Certificate create(Certificate certificate);

    Certificate update(Certificate certificate);

    void delete(String id);
}


