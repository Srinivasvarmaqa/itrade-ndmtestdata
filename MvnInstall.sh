#Maven package and install

Path=${1}
cd ${Path}

cd ITTDriverLayer
mvn clean install -U -DskipTests
mvn clean package -U -DskipTests
cd -

cd ITTBusinessLayer
mvn clean install -U -DskipTests
mvn clean package -U -DskipTests
cd -

cd ITTBaseTest
mvn clean install -U -DskipTests
mvn clean package -U -DskipTests
cd -

cd ITTSampleTestRepo
mvn clean install -U -DskipTests
mvn clean package -U -DskipTests
