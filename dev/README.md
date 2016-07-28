# Publish to Sonatype

See:
https://github.com/sbt/sbt.github.com/blob/gen-master/src/jekyll/using_sonatype.md

1. Copy content of
     dev/build.sbt.end   to the end of build.sbt
     dev/plugins.sbt.end to the end of project/plugins.sbt
2. Run ``sbt publish-signed``.
3. Login at https://oss.sonatype.org/ and from "Staging Repositories" select the
   newly published item, click "Close" then "Release".
