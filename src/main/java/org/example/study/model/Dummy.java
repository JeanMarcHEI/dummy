package org.example.study.model;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dummy implements Serializable {
    private String id;
    private String name;
}