#!/usr/bin/env bash

# 自定义工程名及URL
#prjnames=("project1" "project2" "project3")
#prjurls=("xx.xx.xx.xx:7477" "xx.xx.xx.xx:23053" "xx.xx.xx.xx:24275")
prjnames=("demo")
prjurls=("localhost:18080")

# 默认参数
datestr=`date +%Y%m%d`
srcdir=./target/asciidoc/html
destdir=./src/docs/html/${datestr}
mkdir ${destdir}

# 循环生成文档
for prjname in ${prjnames[@]}
do
    prjurl=${prjurls[${i}]}
    echo "文档生成开始 - ${prjname} - ${prjurl}"

    mvn clean test -Dcustom.baseurl=${prjurl}
    cp ${srcdir}/index.html ${destdir}/${prjname}.html

    i=$((i+1))
done
