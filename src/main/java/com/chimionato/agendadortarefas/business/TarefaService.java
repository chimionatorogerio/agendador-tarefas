package com.chimionato.agendadortarefas.business;

import com.chimionato.agendadortarefas.business.dto.TarefasDTO;
import com.chimionato.agendadortarefas.business.mapper.TarefaConverter;
import com.chimionato.agendadortarefas.infrastructure.entity.TarefasEntity;
import com.chimionato.agendadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import com.chimionato.agendadortarefas.infrastructure.repository.TarefasRepository;
import com.chimionato.agendadortarefas.infrastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefaService {
    private final TarefasRepository tarefasRepository;
    private final TarefaConverter tarefaConverter;
    private final JwtUtil jwtUtil;
    public TarefasDTO gravarTarefa(String token, TarefasDTO dto){
        String email = jwtUtil.extrairEmailToken(token.substring(7));
        dto.setEmailUsuario(email);
        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        TarefasEntity entity = tarefaConverter.paraTarefaEntity(dto);
        return tarefaConverter.paraTarefaDTO(
                tarefasRepository.save(entity));
    }
}
