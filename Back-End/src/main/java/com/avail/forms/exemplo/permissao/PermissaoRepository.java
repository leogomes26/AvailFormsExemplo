package com.avail.forms.exemplo.permissao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissaoRepository extends JpaRepository<PermissaoEntity, Long> {
	
	public PermissaoEntity findByRole(String role);

}
