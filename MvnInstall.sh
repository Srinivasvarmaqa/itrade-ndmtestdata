#Maven package and install

Path=`pwd`
#cd ${Path}

cd ../itnf-driver
mvn clean install -U -DskipTests
mvn clean package -U -DskipTests
cd -

cd ../itnf-business
mvn clean install -U -DskipTests
mvn clean package -U -DskipTests
cd -

cd ../itnf-basetest
mvn clean install -U -DskipTests
mvn clean package -U -DskipTests
cd -

cd ../itnf-omsent
mvn clean install -U -DskipTests
mvn clean package -U -DskipTests
