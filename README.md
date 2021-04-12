# LastCheckAt

### Tables

#### Item

| Filed       |        Type |     Meaning |
| ----------- | ----------- | ----------- |
| id | TINYINT     |			  |
| name | Text     |			  |
| created_at  | DATETIME    |			  |
| updated_at  | DATETIME    |			  |

#### LastCheckAt

| Filed       |        Type |     Meaning |
| ----------- | ----------- | ----------- |
| item_id | TINYINT     |			  |
| last_check_at| DATETIME     |			  |
| is_current  | Boolean     |			  |
| created_at  | DATETIME    |			  |
| updated_at  | DATETIME    |			  |

```
CREATE DATABASE lastCheckAt;
USE lastCheckAt;

-- todo:mysql　Ver　5.7.12for Linux(x86_64)中一个表只能有一个TIMESTAMP
CREATE TABLE item(
`id` TINYINT NOT NUll AUTO_INCREMENT COMMENT 'Item ID',
`name` VARCHAR(120) NOT NULL COMMENT 'Item name',
`created_at` DATETIME  NOT NULL COMMENT 'create time',
`updated_at`   DATETIME   NOT NULL COMMENT 'update time',
PRIMARY KEY (id)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='item';


CREATE TABLE last_check_at(
`id` BIGINT NOT NUll AUTO_INCREMENT COMMENT ' ID',
`item_id` TINYINT NOT NULL COMMENT 'Item ID',
`last_check_at` DATETIME NOT NULL COMMENT 'last check time',
`is_current` TINYINT NOT NULL DEFAULT true COMMENT 'bool',
`created_at` DATETIME NOT NULL COMMENT 'create time',
PRIMARY KEY (id)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='last_check_at'
```

### API

#### saveItem
Input: name
#### updateItem
Input: name,item_id
#### updateLastCheckAt
Input:item_id

ToDo
1. Update item save Item name should not be ""