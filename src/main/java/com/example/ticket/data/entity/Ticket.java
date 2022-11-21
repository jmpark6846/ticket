package com.example.ticket.data.entity;


import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ticket")
public class Ticket extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    private String header;

    @Column(columnDefinition = "TEXT")
    private String body;

    private TicketStatus status;
}

