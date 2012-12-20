ompp
====

Open Medical Physics Platform

The open medical physics platform (OMPP) is intended to be an open-source platform to support medical physicists.
The platform is for research purposes and is NOT approved by the U.S. Food and Drug Administration (FDA).

The goal of OMPP is to provide a platform for medical physicists to store, analyze, and share data/protocols relevant to the tasks of a clinical medical physicist. Following are the most basic requirements:

1) Installation

1.1) The OMPP shall be able to run on Windows, Mac, and Linux.

1.2) The OMPP shall be able to be installed and run standalone out of the box with no need for an IT department to install server components such as webservers, MySQL, etc.

2) Data Storage and Retrieval

2.1) The OMPP shall support local data storage on a single workstation or shared network drive for small organizations with minimal IT support.

2.2) The OMPP shall support remote data storage to enable centralized data storage and access, support larger organizations, and enable collaboration amongst medical physicists by making it easy to optionally share data with the wider community.

2.3) The OMPP shall provide optional authorization and authentication mechanisms to create, retrieve, update, and delete data for the sake of ensuring data integrity.

2.4) The OMPP shall provide support for tracking revisions of data over time to support quality assurance (ensure the right data is currently being used), track changes in equipment over time, and assess the impact of changes.

2.5) The OMPP shall provide a central method for defining data model standards.

2.6) The OMPP shall provide the ability for contributors to auto-generate code based on the central data model to enable a variety of other software platforms to easily read and analyze the data.

3) Software Architecture

3.1) The OMPP shall support a plugin based architecture for maximum reusability, and extendability by the medical physics community.

TECHNOLOGIES
The following technologies are presently being used:

1) Eclipse Rich Client Platform 4
1.1) Eclipse Modeling Framework
1.2) Connected Data Objects (CDO)
