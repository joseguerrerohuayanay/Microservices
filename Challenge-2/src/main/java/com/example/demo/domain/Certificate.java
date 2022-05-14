package com.example.demo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "certificate")
public class Certificate {

    @Id
    private String id;
    private String institution;
    private String date;
    private String price;

}
