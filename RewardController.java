package com.animalHoming.AnimalReHoming.Contorller;

import com.animalHoming.AnimalReHoming.Model.Reward;
import com.animalHoming.AnimalReHoming.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reward")
public class RewardController {
    @Autowired
    private RewardService rewardService;

    @GetMapping
    public List<Reward> getReward() {
        return rewardService.findAll();
    }
    @GetMapping("{/id}")
    public Reward getRewardById(@PathVariable Long id) {
        return rewardService.findById(id);
    }
    @PostMapping
    public void addReward(@RequestBody Reward reward) {
        rewardService.save(reward);
    }
    @PutMapping
    public void updateReward(@RequestBody Reward reward) {
        Reward reward1 = rewardService.findById(reward.getId());
        if (reward1 != null) {
            reward1.setUser(reward1.getUser());
            reward1.setId(reward1.getId());
            reward1.setDate(reward1.getDate());
            rewardService.save(reward1);
        }
    }

}
