package com.example.ticket.data.service;

import com.example.ticket.data.entity.Ticket;

public interface TicketService {
    TicketServiceDto getTicket(Long number);
    TicketServiceDto saveTicket(Ticket ticket);

}
