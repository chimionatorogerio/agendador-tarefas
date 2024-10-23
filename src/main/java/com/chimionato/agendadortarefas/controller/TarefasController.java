package com.chimionato.agendadortarefas.controller;

import com.chimionato.agendadortarefas.business.TarefaService;
import com.chimionato.agendadortarefas.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/tarefas")
@RequiredArgsConstructor
public class TarefasController {
    private final TarefaService tarefaService;
    @PostMapping
    public ResponseEntity<TarefasDTO> gravarTarefas(@RequestBody TarefasDTO dto,
                                                    @RequestHeader("Authorization") String token){
        return ResponseEntity.ok(tarefaService.gravarTarefa(token, dto));
    }
    @GetMapping("/eventos")
    public ResponseEntity<List<TarefasDTO>> buscaListaDeTarefasPorPeriodo(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dataInicial,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dataFinal){
        return ResponseEntity.ok(tarefaService.buscaTarefasAgendadasPorPeriodo(dataInicial, dataFinal));
    }
    @GetMapping
    public ResponseEntity<List<TarefasDTO>> buscaTarefasPorEmail(@RequestHeader("Authorization") String token){
        List<TarefasDTO> tarefas = tarefaService.buscaTarefasPorEmail(token);
        return ResponseEntity.ok(tarefas);
    }



}
