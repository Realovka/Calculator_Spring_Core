package org.example.service;

import org.example.entity.History;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HistoryService {
   List<History> historyList = new ArrayList<>();

    public List<History> historyList(History history){
        historyList.add(history);
        return historyList;
    }
}
