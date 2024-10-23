package com.chimionato.agendadortarefas.business.mapper;

import com.chimionato.agendadortarefas.business.dto.TarefasDTO;
import com.chimionato.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefaConverter {
    TarefasEntity paraTarefaEntity(TarefasDTO dto);
    TarefasDTO paraTarefaDTO(TarefasEntity entity);
    List<TarefasEntity> paraListaTarefasEntity(List<TarefasDTO> dtos);
    List<TarefasDTO> paraListaTarefasDTO(List<TarefasEntity> entities);
}
