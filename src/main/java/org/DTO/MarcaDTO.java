package org.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MarcaDTO {

    private Long id;
    @NotBlank(message = "Este campo e obrigatorio")
    @Size(max = 100)
    private String descricao;
    @JsonIgnore
    private List<ModeloDTO> modelos;
}
