# ComputeLoan
## 计算贷款支付的程序的算法描述如下：
### 第一步 ： 提示用户输人年利率 、 年数以及贷款额度 。 （ 利率通常表示为对 1 年时间的本 金的百分比 。 这被称为年利率 。 ）
### 第二步 ： 对于年利率的输入是一个百分比格式的数字 ， 比如 4.5 % 。 程序需要通过除以
### 100 将它转换成为一个十进制数 。 为了从年利率值得到月利率 ， 将它除以 12 , 因为 1 年有
### 12 个月 。 因此 ， 为了得到十进制格式的月利率值 ， 需要将百分比格式的年利率数除以 1200 。
### 比如 ， 如果年利率是 4.5 % , 那么月利率则为 4.5 / 1200 = 0.003 75 。
### 第三步 ： 使用前面的公式计算月支付额度 。
### 第四步 ： 计算总共支付额度 ， 等于月支付额度乘以 12 , 再乘以年数 。
### 第五步 ： 显示月支付额度和总共支付额度 。
