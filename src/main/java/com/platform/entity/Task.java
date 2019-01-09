package com.platform.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author: zwl
 * @Date: 2019/1/2 15:11
 *
 * 任务实体类
 */
@Entity
@Table(name = "t_task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "task_id", nullable = true, length = 32)
    private Integer id;

    //任务描述
    @Column(name = "task_describe", nullable = true, length = 32)
    private String describe;

    //任务价格
    @Column(name = "task_price", nullable = true, length = 32)
    private double price;

    //截止时间
    @Column(name = "task_endtime", nullable = true, length = 32)
    private Date endTime;

    //任务接手人
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User toUserId;



}
