package top.xia.boot.config.model;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author: 夏企博
 * @Date: 2025/9/11
 * @Version: 1.0
 */
@SpringBootTest
@Slf4j
public class TeamTest {
    @Resource
    private  Team team;

    @Test
    void textTeam1() {
        log.info("team: {}", team);
        assertEquals("xia", team.getLeader());

        assertEquals(team.getPhone().matches("^[0-9]{11}$"), true);

        assertEquals(team.getAge() > 1 && team.getAge() <= 5, true);

        assertEquals(team.getCreateDate().isBefore(LocalDate.now()), true);
    }
}