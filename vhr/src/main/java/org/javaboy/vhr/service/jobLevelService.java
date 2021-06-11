package org.javaboy.vhr.service;

import org.javaboy.vhr.mapper.JObLevelMapper;
import org.javaboy.vhr.model.JobLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;

@Service
public class jobLevelService {
    @Autowired
    JObLevelMapper jObLevelMapper;
    public List<JobLevel> getAllJobLevels() {
        return jObLevelMapper.getAllJobLevels();
    }

    public Integer addJobLevel(JobLevel jobLevel) {
        jobLevel.setCreateDate(new Date());
        jobLevel.setEnabled(true);
        return jObLevelMapper.insertSelective(jobLevel);
    }

    public Integer updateJobLevelById(JobLevel jobLevel) {
        return jObLevelMapper.updateByPrimaryKeySelective(jobLevel);
    }

    public Integer deleteJobLevelById(Integer id ) {
        return jObLevelMapper.deleteByPrimaryKey(id);
    }
}
