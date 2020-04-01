# One To One Bi-directional
- 1 instructor have 1 instructor detail
- instructor --> instructor detail (@OneToOne(cascade = CascadeType.ALL))
- instructor detail --> instructor (@OneToOne(mappedBy = "instructorDetail", cascade = CascadeType.ALL))
- delete instructor --> delete instructor_detail