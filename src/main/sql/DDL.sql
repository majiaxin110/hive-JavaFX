CREATE TABLE goods (GoodsID string, Name string, InPrice float, OutPrice float, SupplierID string)
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde' WITH SERDEPROPERTIES
  ("separatorChar" = "\t","escapeChar" = "\\") STORED AS TEXTFILE;

CREATE TABLE supplier (SupplierID string, Telephone string)
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde' WITH SERDEPROPERTIES
    ("separatorChar" = "\t","escapeChar" = "\\") STORED AS TEXTFILE;

CREATE TABLE store (StoreID string, Name string, Location string)
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde' WITH SERDEPROPERTIES
("separatorChar" = "\t","escapeChar" = "\\") STORED AS TEXTFILE;

CREATE TABLE saleHistory (ID string, saleTime timestamp, storeID string, VIPID string)
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde' WITH SERDEPROPERTIES
("separatorChar" = "\t","escapeChar" = "\\") STORED AS TEXTFILE;

CREATE TABLE saleContent (GoodsID string, HistoryID string, Amount int)
  ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde' WITH SERDEPROPERTIES
  ("separatorChar" = "\t","escapeChar" = "\\") STORED AS TEXTFILE;

CREATE TABLE storage (StorageID string, desrciption string)
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde' WITH SERDEPROPERTIES
("separatorChar" = "\t","escapeChar" = "\\") STORED AS TEXTFILE;

CREATE TABLE storageAmount (StorageID string, GoodsID string, Amount int)
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde' WITH SERDEPROPERTIES
("separatorChar" = "\t","escapeChar" = "\\") STORED AS TEXTFILE;

CREATE TABLE VIP (VIPID string, Telephone string)
  ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde' WITH SERDEPROPERTIES
("separatorChar" = "\t","escapeChar" = "\\") STORED AS TEXTFILE;

insert into table saleHistory VALUES ('18004752','2018-12-07 12:34:56.1','17944104','100001');

select id,to_date(saleTime) AS TTime from saleHistory;


CREATE TABLE goods (GoodsID string, Name string, InPrice float, OutPrice float, SupplierID string)
row format delimited
fields terminated by ',';
-- ---------------------------------------------------------------
DROP TABLE goods;
CREATE TABLE goods (GoodsID string, Name string, InPrice float, OutPrice float, SupplierID string)
  row format delimited
  fields terminated by ',';

DROP TABLE supplier;
CREATE TABLE supplier (SupplierID string, Telephone string)
  row format delimited
  fields terminated by ',';

DROP TABLE store;
CREATE TABLE store (StoreID string, Name string, Location string)
  row format delimited
  fields terminated by ',';

DROP TABLE saleHistory;
CREATE TABLE saleHistory (ID string, saleTime timestamp, storeID string, VIPID string)
  row format delimited
  fields terminated by ',';

DROP TABLE saleContent;
CREATE TABLE saleContent ( HistoryID string, GoodsID string,Amount int)
  row format delimited
  fields terminated by ',';

DROP TABLE storage;
CREATE TABLE storage (StorageID string, desrciption string)
  row format delimited
  fields terminated by ',';

DROP TABLE storageAmount;
CREATE TABLE storageAmount (StorageID string, GoodsID string, Amount int)
  row format delimited
  fields terminated by ',';

DROP TABLE VIP;
CREATE TABLE VIP (VIPID string, Telephone string)
  row format delimited
  fields terminated by ',';