package org.example.backend.mapper.Account;


import org.example.backend.dto.response.account.AdminAccountDTOResponse;
import org.example.backend.entity.child.account.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AdminAccountMapper {
    @Mapping(source = "mfaEnabled", target = "mfaEnabled")
    AdminAccountDTOResponse toResponseDTO(Account account);

}
