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


Test21

1 题目说了1000位，故要采用字符串

2 使用toArray（）造成了超时，故采用string.charAt()，String本身就是数组化，重复操作了


Test26

1 使用math.round 方法四舍五入，注意接收参数是double

2 使用printf 和 %02d补齐输出 01


Test31

1 对于输入的字符串，直接当数字来使用，加权求和，导致错误
2 第一次使用加权求和，新知识

Test36

1 四舍五入，使用Math.round（（double）n/2）

Test41

使用LinkedList保存输入，检索的时候需要遍历列表，导致样例三超时，改为Map后，将试机号作为key，直接输出，通过。
