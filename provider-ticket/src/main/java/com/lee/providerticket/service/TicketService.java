package com.lee.providerticket.service;

import org.springframework.stereotype.Service;

@Service
public class TicketService {

    public String getTicket(){
        return "提供一张电影票";
    }
}
