package kr.hs.study.JPAPRAC.service;

import kr.hs.study.JPAPRAC.dto.myuserDTO;

import java.util.List;

public interface myuserService {
    public void insert(myuserDTO dto);
    public List<myuserDTO> list();

    public void delete(Long id);

    public myuserDTO view(Long id);
    public void update(Long id, myuserDTO dto);
}
