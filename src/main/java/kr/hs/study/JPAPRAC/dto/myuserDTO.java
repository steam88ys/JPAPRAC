package kr.hs.study.JPAPRAC.dto;

import kr.hs.study.JPAPRAC.entity.myuserEntity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class myuserDTO {
    private Long id;
    private String userid;
    private String username;
    
    // dto -> entity로 변환하는 방법
    public myuserEntity toEntity(myuserDTO dto) {
        myuserEntity e = myuserEntity.builder()
                .id(dto.getId())
                .userid(dto.getUserid())
                .username(dto.getUsername())
                .build();
        return e;
    }
}
