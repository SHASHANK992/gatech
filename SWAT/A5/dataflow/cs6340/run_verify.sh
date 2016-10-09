#!/usr/bin/env bash 
OPT=$1
: ${OPT:=1}
echo "option: $OPT"

case ${OPT} in
1)
    echo "liveness on array_demo"
    TEST_DIR=array_demo
    TEST=liveness
    ;;
2)
    echo "reachdef on array_demo"
    TEST_DIR=array_demo
    TEST=reachdef
    ;;
3)
    echo "liveness on complex_test"
    TEST_DIR=complex_test
    TEST=liveness
    ;;
4)
    echo "reachdef on complex_test"
    TEST_DIR=complex_test
    TEST=reachdef
    ;;
5)
    echo "liveness on fibo_test"
    TEST_DIR=fibo_test
    TEST=liveness
    ;;
6)
    echo "reachdef on fibo_test"
    TEST_DIR=fibo_test
    TEST=reachdef
    ;;
7)
    echo "liveness on greatest_test"
    TEST_DIR=greatest_test
    TEST=liveness
    ;;
8)
    echo "reachdef on greatest_test"
    TEST_DIR=greatest_test
    TEST=reachdef
    ;;
esac

DIR=examples/${TEST_DIR}/chord_output/
./cs6340_a5_verification.py ${DIR}/my${TEST}.txt  ${DIR}/../results/${TEST}.txt ${TEST}


