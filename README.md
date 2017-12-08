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

【未全部通过】Test25

1 按照题目的思路，将链表翻转后再输出，在牛客网内存超限


Test26

1 使用math.round 方法四舍五入，注意接收参数是double

2 使用printf 和 %02d补齐输出 01

Test 27

比较坑的是，符号后面不需要空格

Test28

1 按照面向对象思路，建立了Person类，并实现Comparator接口，

2 最大的问题应该在比较大小上，对出生日期进行了拆分，而且还转换成数字比较，逻辑复杂，运算冗余，直接用字符串的比较就完全可行，修改后在牛客网通过运行


【未全部通过】Test30(完美数列)

1 采用两次循环来依次查找

2 未全部通过

Test31

1 对于输入的字符串，直接当数字来使用，加权求和，导致错误
2 第一次使用加权求和，新知识

Test32

1 这个题首先就要考虑选用Map来做

2 重新复习了for each循环，虽然pat是用java6编译，但是lambda表达式还是要学习的

Test33

1 使用正则表达式排除字符串中的大写字母时，要是用String.replaceAll();

2 character.toUpperCase(char);转换字符串大小写

Test34(有理数四则运算)

1 分子分母用int仅通过前两项，改用long后通过，但是牛客网只需要int

2 还是思路问题，比如在约分时，就将分母的负号转移至分子

3 求最大公约数（greatest common divisor）

        public int gcd(int a, int b){

            if(b==0) return a;
    
            return gcd(b,a%b);

        }

Test36

1 四舍五入，使用Math.round（（double）n/2）

Test37

1 使用String.split("\\.");对.进行分隔，因为'.'和'|'为转义字符

2 将货币换算成最小单位时，计算方法出错了

Test38

1 再出现百分制的时候，使用数组似乎比Map这种代码要少，也快

Test39

1 对字符串字符替换用了string.replace('a','b');是要全部替换的

Test41

使用LinkedList保存输入，检索的时候需要遍历列表，导致样例三超时，改为Map后，将试机号作为key，直接输出，通过。

【未全部通过】Test44

1  进制转换，当数字能被13整除时，仅输出进制位，0不输出

2  样例2仍然无法通过

【未全部通过】Test45

1  从数组到链表再到数组，还是数组最好，取值最快

2  本题关键在于明白，主元的位置和排序完成后所处位置一样，同时，所有主元直接输出即可，不需要排序

3  所以使用了一个排序后的数组作为参照，只需要拿待确认数和排序后数组前后两个数的大小比较即可判断

4  却不知道为啥还是超时，只通过了样例1。

Test47

1  将-用空格替换，然后分割字符串，得到组别和分数，用映射保存结果，求出最大的。结果样例二超时

2  将映射改为一个1001大小的数组，最终全部通过。


【未全部通过】Test48

1  将两个字符串不一致的部分切掉，如果第二个长，先输出长的部分

2  将剩下的比较输出

3  第2,5示例答案错误

【未全部通过】Test49

1  查找规律，数列首尾乘以n，中间项每个乘以2*(n-1)

2  第三四样例超时

【未全部通过】Test50

1  测试点2错误，6、7超时

【未全部通过】Test53

1  样例2超时，输出%使用%%

【未全部通过】Test54

1  不管是否有小数点，Double.parseDouble()方法都可以将输入转化成double型。

2  容易错误出在了字符串的方法使用上，indexOf()  charAt() 两个方法混淆，总是发现不了问题。

3  第3个测试没通过,反复测试后发现，输入为3.  为合法

4  使用异常抛出，加Double转换减少了很多的判断步骤。

【未全部通过】Test55

1  后三个测试点超时

2  关键是发现题目没什么难，要怎么排序就怎么排，最开始被左右交叉输出给吓到了


【未全部通过】Test57

1  示例3 4 超时

【未全部通过】Test58

1  测试4没有通过

2  对字符串的处理使用了多次替换、分割，不熟练

【未全部通过】Test59

1  测试2,3超时

2  复习了素数的计算，以后全部都要使用BufferedReader输入，详见：https://www.cpe.ku.ac.th/~jim/java-io.html 和http://blog.csdn
.net/samjustin1/article/details/52087061 


Test62

1  使用求最大公约数

2  刚开始使用了将两个分数通分，然后一次增加，结果只有测试点3能通过。 更换方法，尝试 (t*m1 > k*n1 && t*m2 < k*n2) 然后通过了  

【未全部通过】Test63

1  测试点3超时

Test64

1  对于循环小于100的判断，尽量采用数组来存储，采用Map不便于后续输出结果

【未全部通过】Test65

1  将成对的ID存放在Map中，互相映射，对每个判断ID，如果有伴侣并且在list中，就将list中的伴侣删除，如果不在list中，就将他加入。如果是单身，就将他加入list。

【未全部通过】Test66

1  用了Scanner和BufferedReader都超时，看来和Java杠上了

【未全部通过】Test68

1  两个测试点错误，一个内存不足

2  分割字符串，使用"\\s+"可以选中所有的空格，不仅一个，可以连table也排除掉

3  因为要唯一，所以用Map判断，多于两个肯定不是，也就不用判断了。

4  输出long型格式化标识符也是%d

Test69

ArrayList 好处是用下标访问元素， LinkList好处是便于往前面或中间插入元素

【未全部通过】Test70

1  将数组排序后从小到大连接折叠

【未全部通过】Test71

1  测试点4没有通过，奇怪的题目

【未完成】Test73

1  测试点3错误，4超时。

【未全部通过】Test74

1  测试点6答案错误

2  对于此类问题，要讲前面的位置补零最方便

【未全部通过】Test75

1  测试点5错误，测试点6内存超限