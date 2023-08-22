package kr.hs.study.JPAPRAC.service;

import kr.hs.study.JPAPRAC.dto.myuserDTO;
import kr.hs.study.JPAPRAC.entity.myuserEntity;
import kr.hs.study.JPAPRAC.repository.myuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class myuserServiceImpl implements myuserService {
    @Autowired
    private myuserRepository repo;

    @Override
    public void insert(myuserDTO dto) {
        // dto -> entity로 변환
        myuserEntity me = dto.toEntity(dto);
        repo.save(me);
    }
}
