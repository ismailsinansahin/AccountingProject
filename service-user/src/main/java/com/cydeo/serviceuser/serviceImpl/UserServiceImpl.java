package com.cydeo.serviceuser.serviceImpl;

import com.cydeo.servicecommon.client.CompanyServiceClient;
import com.cydeo.servicecommon.contract.UserDto;
import com.cydeo.serviceuser.entity.User;
import com.cydeo.serviceuser.mapper.MapperUtil;
import com.cydeo.serviceuser.repository.UserRepository;
import com.cydeo.serviceuser.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final MapperUtil mapperUtil;
    private final CompanyServiceClient companyServiceClient;

    @Override
    public List<UserDto> getAll() {
        return userRepository
                .findAll()
                .stream()
                .map(user -> mapperUtil.convert(user, new UserDto()))
                .collect(Collectors.toList());
    }

    @Override
    public UserDto get(Long id) {
        return mapperUtil.convert(userRepository.findById(id).get(), new UserDto());
    }

    @Override
    @Transactional
    public UserDto create(UserDto userDto) {
        User user = mapperUtil.convert(userDto, new User());
        Long companyId = companyServiceClient.get(userDto.getCompanyName()).getBody().getId();
        user.setCompanyId(companyId);
        userRepository.save(user);
        return mapperUtil.convert(user, new UserDto());
    }

    @Override
    public UserDto update(UserDto userDto) {
        User user = userRepository.save(mapperUtil.convert(userDto, new User()));
        userDto.setId(user.getId());
        return userDto;
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(userRepository.findById(id).get());
    }

}
