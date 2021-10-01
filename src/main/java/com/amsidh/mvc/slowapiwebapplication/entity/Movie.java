package com.amsidh.mvc.slowapiwebapplication.entity;


import lombok.*;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@Entity
@Table(name = "MOVIE")
public class Movie implements Serializable {
    @Id
    @GeneratedValue(generator = "hilo", strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String title;
}
