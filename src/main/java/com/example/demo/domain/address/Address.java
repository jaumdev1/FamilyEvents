package com.example.demo.domain.address;


import com.example.demo.domain.event.Event;
import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "address")
@Entity
public class Address {
   @Id
   @GeneratedValue
    private UUID id;

   private String city;

   private String uf;

   @ManyToOne
    @JoinColumn(name ="event_id")
    private Event event;
}
