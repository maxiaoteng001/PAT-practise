# PAT-practise
This repository is created for recording my PAT(basic-level) practises 

Test3 

1 通过的关键，在于发现xPyTz的序列中，x*y=z的关系，其中为三部分相乘的计算

Test5

1 使用实现SortedMap的TreeMap来实现关键数的判断，如果不是关键数，设置对应key值的value为false

2 无需再排序，倒序输出即可

3 主要方法：arraylist.clear();//清空链表
          hashMap.replace();hashMap.put();
          
4 易错：在最后将关键数从Map转移至List时，使用了原始输入作为key检索，导致list中的排序是输入顺序，而不是从小到大，最后发生了错误，修改后对Map使用for each循环搞定（for(Map.Entry<Integer,
Boolean>  e : result.entrySet())）

Test10

1 文件名称全部改为TestXX，便于排序和查找

2 还是要力求简洁，比如这次，对每次输入的两个数循环操作，就不需要私有类，也不需要arrayList

3 Scanner每次要关闭

Test11

1 判断素数的算法，挨个判断导致运行时间太长，选择判断到n的平方根

2 求素数集时，没有使用<=导致如果输入的是素数，则最后一个没有被包括

Test12

1 力求简洁，刚开始用了数组来保存输入，然后计算，导致第三例运行超时

2 在IDE里面可以通过，但是服务器超时，搜索知乎后按网友建议，使用BufferedReader代替Scanner，以后优先选用BufferedReader
  //BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

Test 13

1 求素数的算法isPrime：
    private boolean isPrime(int n){
        boolean result = true;
        if(n==2)
            result = true;
        else {
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i ==0)
                    result = false;
            }
        }
        return result;
    }

2 案例4仍然无法通过,查看博客[http://www.cnblogs.com/tangyikejun/p/4300409.html]发现样例4是较大数，对求素数算法修改，增加偶数判断，然后全部通过。

Test14

1 题目理解很重要，对比字符时还纠结大小写，没必要

2 在100ms内测试只有三个通过，另有三个超时。在牛客网通过测试，我看最近两期的测试都在400ms，可能对时间要求没以前那么高，但仍要使用BufferedReader读取输入

3 牛客网对每次测试的不通过会显示测试内容，如果总是通不过可以考虑去哪里，比看别人代码好多了

Test15

1 针对需要降序和升序输出结果，Student类实现了Comparator借口，同时使用了Collections.sort(arrayList);进行排序

2 对于输入，依旧采用readLine(); 和 string.split(" ");

3 剩下的还是要认真读题，这个真心很耗时间

4 后面的开始，基本题题超时，牛客网能够通过，有点心虚

Test18

1 最后一例超时

2 使用BufferedReader读取一个数字时，还是尽量要采用readLine()的方法，read()只能读取一个字符串

3 使用x？y:z代替长串的if语句

Test19

1 使用if语句时，多考虑条件是否全面，此次测试忽视了6174本身的测试

Test20

1 因为本次全是数字，所以使用了Scanner来获取输入

2 在官网测试全部超时，牛客网通过

3 新建了Mooncake类并使用Collections.sort(arrayList);对链表进行排序

Test21

1 题目说了1000位，故要采用字符串

2 使用toArray（）造成了超时，故采用string.charAt()，String本身就是数组化，重复操作了

Test22

1 最开始采用int作为结果，只是将每次的余数乘以10的幂，发现2进制超出了int大小，便采用arraylist来倒序输出

Test24(主要考察字符串的处理)

1 使用replace(string1,string2)去除了其中的小数点

2 使用subString(indexBegin,indexEnd)对字符串精准拆分

3 逻辑不明导致不能一次通过

Test25

1 按照题目的思路，将链表翻转后再输出，在牛客网内存超限


Test26

1 使用math.round 方法四舍五入，注意接收参数是double

2 使用printf 和 %02d补齐输出 01

Test 27

比较坑的是，符号后面不需要空格

Test28

1 按照面向对象思路，建立了Person类，并实现Comparator接口，

2 最大的问题应该在比较大小上，对出生日期进行了拆分，而且还转换成数字比较，逻辑复杂，运算冗余，直接用字符串的比较就完全可行，修改后在牛客网通过运行



Test31

1 对于输入的字符串，直接当数字来使用，加权求和，导致错误
2 第一次使用加权求和，新知识

Test36

1 四舍五入，使用Math.round（（double）n/2）

Test41

使用LinkedList保存输入，检索的时候需要遍历列表，导致样例三超时，改为Map后，将试机号作为key，直接输出，通过。
