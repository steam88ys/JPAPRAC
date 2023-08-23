package kr.hs.study.JPAPRAC.entity;

import kr.hs.study.JPAPRAC.dto.myuserDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@NoArgsConstructor  // 기본생성자
@AllArgsConstructor
//@Table(name = "myuser")
public class myuserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String userid;

    @Column
    private String username;

}
