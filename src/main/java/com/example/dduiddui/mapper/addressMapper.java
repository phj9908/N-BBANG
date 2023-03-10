package com.example.dduiddui.mapper;

import com.example.dduiddui.vo.addressVO;
import com.example.dduiddui.vo.userVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface addressMapper {
    List<addressVO> getAddressList(Integer mbrSn); // 즐찾 불러오기

    void insertAddr(addressVO addressVO); // 즐찾 추가

    addressVO getAddress(Integer mbrSn); // 기본주소 불러오기

    void updateAdr(Integer mbrSn);

    void updateMainAdr(Integer adrSn);

    addressVO getAdrByTtl(@Param("adr_ttl") String adrTtl,@Param("mbr_sn") Integer mbr_sn);

}
