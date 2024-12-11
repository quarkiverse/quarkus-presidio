# Quarkus Presidio
<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
[![All Contributors](https://img.shields.io/badge/all_contributors-1-orange.svg?style=flat-square)](#contributors-)
<!-- ALL-CONTRIBUTORS-BADGE:END -->

[![Version](https://img.shields.io/maven-central/v/io.quarkiverse.presidio/quarkus-presidio?logo=apache-maven&style=flat-square)](https://central.sonatype.com/artifact/io.quarkiverse.presidio/quarkus-presidio-parent)

## Documentation

This extension provides a REST Client to interact with [Presidio](https://microsoft.github.io/presidio/) Analyzer and Anonymizer services.

Apart from providing a REST Client, this extension integrates with [Quarkus Health Check extension](https://quarkus.io/guides/smallrye-health) registering a readness probe against Presidio `/health` endpoint.

Moreover, it provides [DevServices](https://quarkus.io/guides/dev-services) integration starting an Analyzer and an Anonymizer service, and configuring the `URL` pointing to these isntances.



## Contributors ✨

Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tbody>
    <tr>
      <td align="center" valign="top" width="14.28%"><a href="http://www.lordofthejars.com"><img src="https://avatars.githubusercontent.com/u/1517153?v=4?s=100" width="100px;" alt="Alex Soto"/><br /><sub><b>Alex Soto</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-presidio/commits?author=lordofthejars" title="Code">💻</a> <a href="#maintenance-lordofthejars" title="Maintenance">🚧</a></td>
    </tr>
  </tbody>
</table>

<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!