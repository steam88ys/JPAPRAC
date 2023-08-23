package kr.hs.study.JPAPRAC.service;

import kr.hs.study.JPAPRAC.dto.myuserDTO;
import kr.hs.study.JPAPRAC.entity.myuserEntity;
import kr.hs.study.JPAPRAC.repository.myuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<myuserDTO> list() {
        List<myuserEntity> e = repo.findAll();
        // entity -> dto로 변환
        // dto타입의 arraylist 생성 (new로 생성)
        List<myuserDTO> dto = new ArrayList<myuserDTO>();
        for(int i=0; i<e.size(); i++) {
            myuserEntity e1 = e.get(i);
            myuserDTO dto2 = myuserDTO.builder()
                    .id(e1.getId())
                    .userid(e1.getUserid())
                    .username(e1.getUsername())
                    .build();
            dto.add(dto2);
        }
        return dto;
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
