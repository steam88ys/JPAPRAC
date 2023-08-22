package kr.hs.study.JPAPRAC.repository;

import kr.hs.study.JPAPRAC.entity.myuserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface myuserRepository extends JpaRepository<myuserEntity, Long> {

}
