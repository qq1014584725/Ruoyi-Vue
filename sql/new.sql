drop table if exists sys_asset_info;
create table sys_asset_info (
  info_id           int(11)     not null auto_increment    comment '资产信息id',
  asset_type        enum('专用设备',
                         '通用设备',
                         '办公用品',
                         '软件',
                         '材料及元器件',
                         '自研设备',
                         '其他')                    comment '资产类型',
  asset_sub_type    varchar(30)  default null      comment '资产子类型',
  asset_name        varchar(30)  default null      comment '设备名称',
  asset_nation      varchar(30)  default null      comment '国别',
  asset_factory     varchar(30)  default null      comment '生产厂家',
  asset_is_import   bool         default null      comment '是否外贸进口',
  asset_bug_id      varchar(30)  default null      comment '采购项目编号',
  asset_model       varchar(30)  default null      comment '规格型号',
  asset_param       varchar(30)  default null      comment '性能参数',
  asset_num         int(11)      default null      comment '设备数量',
  asset_per_price   decimal(6,2) default null      comment '设备单价',
  asset_total_price decimal(6,2) default null      comment '设备总价',
  asset_arrive_time date                           comment '到货时间',
  asset_hold_time   date                           comment '保修时间',

  project_name      varchar(30)      default null  comment '项目名称',
  project_id        varchar(30)      default null  comment '经费卡号',
  asset_id          varchar(30)      default null  comment '资产编号',
  asset_current_owner  varchar(30)   default null  comment '现在所属人',
  asset_current_location varchar(30) default null  comment '现在所属地点',
  asset_use_to      enum('实验室',
                         '项目',
                         '办公')  default null      comment '资产用途',
  asset_apply_list  varchar(30)     default null   comment '外协外购申请单',
  asset_accept_list varchar(30)     default null   comment '验收单',
  asset_object_img  varchar(30)     default null   comment '实物图',
  asset_other_file  varchar(30)     default null   comment '附件',
  asset_use_state   enum('在库',
                         '在用',
                         '借用')                    comment '现在使用情况',
  asset_use_situation   enum('正常',
                             '维修',
                             '报废')                comment '现在使用状态',

  asset_is_complete  bool          default false   comment '资产是否完成录入',
  primary key (info_id)
) engine=innodb auto_increment=200 comment = '资产信息表';



drop table if exists sys_option_info;
create table sys_option_info (
    option_id           int(11)     not null auto_increment    comment '资产信息id',
    asset_use_type      enum('出库',
                             '借用',
                             '归还')                            comment '提交操作类型',
    asset_info          int(11)     default null               comment '资产信息id',
    asset_owner         varchar(30) default null               comment '所属人',
    asset_location      varchar(30) default null               comment '所属地点',
    asset_use_time      date                                   comment '时间',
    asset_file          varchar(30) default null               comment '所属人',
    asset_allow         varchar(30) default null               comment '审批人',

    is_allow            bool        default null               comment '是否同意',
    disagree_reason     varchar(30) default null               comment '驳回意见',

    is_complete         bool        default false              comment '是否完成审批',
    primary key(option_id)
) engine=innodb auto_increment=200 comment = '资产信息表';