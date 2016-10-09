#!/usr/bin/env bash
echo "compiling array_demo"
pushd ./
cd examples/array_demo
ant
popd

echo "compiling complex_test"
pushd ./
cd examples/complex_test
ant
popd

echo "compiling fibo_test"
pushd ./
cd examples/fibo_test
ant
popd

echo "compiling greatest_test"
pushd ./
cd examples/greatest_test
ant
popd

