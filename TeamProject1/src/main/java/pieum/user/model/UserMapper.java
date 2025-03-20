package pieum.user.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface UserMapper {


	// 사용자 추가 (회원 가입)
    int insertUser(UserDTO user);

    // 특정 사용자 조회 (mno로 조회)
    UserDTO getUserByMno(String mno);

    // 사용자 로그인 정보 확인 (mid와 mpw로 조회)
    UserDTO loginUser(String mid, String mpw);

    // 모든 사용자 조회
    List<UserDTO> getAllUsers();

    // 사용자 정보 수정
    int updateUser(UserDTO user);

    // 사용자 삭제
    int deleteUser(String mno);
	
}
