package org.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ModeloDTO implements Serializable {

    private Long id;
    @NotBlank(message = "Este campo e obrigatorio")
    @Size(max = 100)
    private String descricao;
    @Marca
    private MarcaDTO marca;
}
