#!/usr/bin/env bash

OPT=$1
ant compile
: ${OPT:=1}
case ${OPT} in
1)
    echo "liveness on array_demo"
    ant -Dchord.work.dir=examples/array_demo/ liveness
    cp 	examples/array_demo/chord_output/log.txt examples/array_demo/chord_output/myliveness.txt
    ./run_verify.sh 1
    ;;
2)
    echo "reachdef on array_demo"
    ant -Dchord.work.dir=examples/array_demo/ reachdef
    cp 	examples/array_demo/chord_output/log.txt examples/array_demo/chord_output/myreachdef.txt
    ./run_verify.sh 2
    ;;
3)
    echo "liveness on complex_test"
    ant -Dchord.work.dir=examples/complex_test/ liveness
    cp 	examples/complex_test/chord_output/log.txt examples/complex_test/chord_output/myliveness.txt
    ./run_verify.sh 3
    ;;
4)
    echo "reachdef on complex_test"
    ant -Dchord.work.dir=examples/complex_test/ reachdef
    cp 	examples/complex_test/chord_output/log.txt examples/complex_test/chord_output/myreachdef.txt
    ./run_verify.sh 4
    ;;
5)
    echo "liveness on fibo_test"
    ant -Dchord.work.dir=examples/fibo_test/ liveness
    cp 	examples/fibo_test/chord_output/log.txt examples/fibo_test/chord_output/myliveness.txt
    ./run_verify.sh 5
    ;;
6)
    echo "reachdef on fibo_test"
    ant -Dchord.work.dir=examples/fibo_test/ reachdef
    cp 	examples/fibo_test/chord_output/log.txt examples/fibo_test/chord_output/myreachdef.txt
    ./run_verify.sh 6
    ;;
7)
    echo "liveness on greatest_test"
    ant -Dchord.work.dir=examples/greatest_test/ liveness
    cp 	examples/greatest_test/chord_output/log.txt examples/greatest_test/chord_output/myliveness.txt
    ./run_verify.sh 7
    ;;
8)
    echo "reachdef on greatest_test"
    ant -Dchord.work.dir=examples/greatest_test/ reachdef
    cp 	examples/greatest_test/chord_output/log.txt examples/greatest_test/chord_output/myreachdef.txt
    ./run_verify.sh 8
    ;;

esac
