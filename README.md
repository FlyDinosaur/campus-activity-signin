# 校园活动报名与签到管理系统

## 1. 项目概述
本项目用于《软件项目管理》课程综合实验，项目背景为学校拟建设一套轻量级校园活动报名与签到管理系统。系统主要支持活动信息发布、学生报名、报名名单审核、现场签到、签到统计和统计结果导出。

## 2. 团队成员与角色
| 姓名 | Git 提交人名称 | 角色 | 主要职责 |
|---|---|---|---|
| 吴宇轩 | wuyuxuan | 项目经理、仓库负责人 | 负责仓库初始化、基础结构、最终集成 |
| 李奕轩 | liyixuan | WBS 负责人 | 负责三级 WBS 分解和交付物说明 |
| 赵新宇 | zhaoxinyu | 配置管理员 | 负责配置管理、分支策略和冲突记录 |
| 伍湘彬 | wuxiangbin | 进度计划负责人 | 负责进度计划、工期安排和总结补充 |

## 3. 项目目录结构
```text
.
├── README.md
├── docs
│   ├── 01-project-charter.md
│   ├── 02-wbs.md
│   ├── 03-schedule.md
│   ├── 04-config-plan.md
│   ├── 05-summary-report.md
│   └── conflict.md
├── src
│   ├── App.java
│   ├── model
│   │   └── Activity.java
│   └── service
│       ├── RegistrationService.java
│       └── SignInService.java
├── test
│   └── AppTest.java
└── assets
    └── .gitkeep
```

## 4. 分支约定
- `main`：最终稳定分支，仅保存验收版本。
- `dev`：日常集成分支，所有成员分支先合并到该分支。
- `feature/wuyuxuan-base`：吴宇轩个人分支。
- `feature/liyixuan-wbs`：李奕轩个人分支。
- `feature/zhaoxinyu-config`：赵新宇个人分支。
- `feature/wuxiangbin-schedule`：伍湘彬个人分支。

## 5. 当前阶段成果
- [X] 项目初始化完成
- [X] WBS 完成到三级
- [X] 简化进度计划形成
- [X] 配置管理文档形成
- [X] 冲突解决并合并
- [X] 总结报告提交到 `main`

## 6. 提交说明
建议所有关键成果优先使用 Markdown 文档，以便比较版本差异并进行冲突处理。
