package br.ufma.lsdi.labvirt.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "LabVirt API",
                version = "1.0.0",
                description = "API for Computational resource management in research laboratories using QEMU/KVM-based virtualization"
        )
)
public class OpenApiConfig {
}
